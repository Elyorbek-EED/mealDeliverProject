package uz.ergashov.pdp_meal.repository.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ergashov.pdp_meal.entity.meal.Meal;
import uz.ergashov.pdp_meal.repository.AbstractRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Repository
public interface MealRepository extends JpaRepository<Meal, Long>, AbstractRepository {

    List<Meal> findAllByDate(LocalDate date);
}
