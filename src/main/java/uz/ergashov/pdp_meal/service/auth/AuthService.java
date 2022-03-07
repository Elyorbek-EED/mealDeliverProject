package uz.ergashov.pdp_meal.service.auth;

import uz.ergashov.pdp_meal.criteria.GenericCriteria;
import uz.ergashov.pdp_meal.dto.auth.AuthCreateDto;
import uz.ergashov.pdp_meal.dto.auth.AuthDto;
import uz.ergashov.pdp_meal.dto.auth.AuthUpdateDto;
import uz.ergashov.pdp_meal.entity.auth.User;
import uz.ergashov.pdp_meal.service.GenericCrudService;

/**
 * Created by Elyor Ergashov
 *
 * @date : 3/3/2022
 * @project : mealDeliver
 */

public interface AuthService extends GenericCrudService<User, AuthDto,
        AuthCreateDto, AuthUpdateDto, GenericCriteria,Long> {
}
