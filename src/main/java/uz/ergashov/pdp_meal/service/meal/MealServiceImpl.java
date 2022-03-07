package uz.ergashov.pdp_meal.service.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.ergashov.pdp_meal.criteria.GenericCriteria;
import uz.ergashov.pdp_meal.dto.meal.MealCreateDto;
import uz.ergashov.pdp_meal.dto.meal.MealDto;
import uz.ergashov.pdp_meal.dto.meal.MealUpdateDto;
import uz.ergashov.pdp_meal.entity.meal.Meal;
import uz.ergashov.pdp_meal.mapper.meal.MealMapper;
import uz.ergashov.pdp_meal.repository.meal.MealRepository;
import uz.ergashov.pdp_meal.service.AbstractService;
import uz.ergashov.pdp_meal.validator.meal.MealValidator;

import java.time.LocalDate;
import java.util.List;
/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Service
public class MealServiceImpl extends AbstractService<
        MealRepository,
        MealMapper,
        MealValidator>
        implements MealService {

    @Autowired
    protected MealServiceImpl(MealRepository repository, MealMapper mapper, MealValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public Long create(MealCreateDto createDto) {
        validator.validOnCreate(createDto);
        Meal meal = mapper.fromCreateDto(createDto);
        return repository.save(meal).getId();
    }

    @Override
    public Void delete(Long id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(MealUpdateDto updateDto) {
        validator.validOnUpdate(updateDto);
        Meal meal = repository
                .findById(updateDto.getId())
                .orElseThrow(() -> new RuntimeException("Not Found"));
        mapper.fromUpdateDto(updateDto, meal);
        repository.save(meal);

        return null;
    }

    @Override
    public List<MealDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public List<MealDto> getAllById(GenericCriteria criteria, Long id) {
        return null;
    }

    @Override
    public MealDto get(Long id) {
        return mapper.toDto(repository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found")));
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }

    public List<MealDto> getAllByDate(String date) {
        LocalDate localDate = validator.validDate(date);
        return mapper.toDto(repository.findAllByDate(localDate));
    }
}
