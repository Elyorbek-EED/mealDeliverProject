package uz.ergashov.pdp_meal.service.department;

import uz.ergashov.pdp_meal.criteria.GenericCriteria;
import uz.ergashov.pdp_meal.dto.department.DepartmentCreateDto;
import uz.ergashov.pdp_meal.dto.department.DepartmentDto;
import uz.ergashov.pdp_meal.dto.department.DepartmentUpdateDto;
import uz.ergashov.pdp_meal.entity.department.Department;
import uz.ergashov.pdp_meal.service.GenericCrudService;

/**
 * Created by Elyor Ergashov
 *
 * @date : 3/4/2022
 * @project : mealDeliver
 */

public interface DepartmentService extends GenericCrudService<Department, DepartmentDto,
        DepartmentCreateDto, DepartmentUpdateDto, GenericCriteria,Long> {
}
