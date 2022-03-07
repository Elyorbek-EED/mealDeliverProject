package uz.ergashov.pdp_meal.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import uz.ergashov.pdp_meal.entity.order.Order;
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
@Transactional
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, AbstractRepository {

    boolean existsByUserIdAndDate(Long id, LocalDate localDate);

    List<Order> findAllByDate(LocalDate localDate);

    List<Order> findAllByMealId(Long mealId);

    List<Order> findAllByUserId(Long userId);

    @Query(value = "select u.chat_id from meal.users u left join (select * from meal.orders o where o.date = current_date) as o on u.id = o.user_id where o.user_id is null;", nativeQuery = true)
    List<Long> notOrderedUsersList();
}
