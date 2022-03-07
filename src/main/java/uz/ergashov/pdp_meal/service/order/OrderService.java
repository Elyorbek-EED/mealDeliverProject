package uz.ergashov.pdp_meal.service.order;

import uz.ergashov.pdp_meal.criteria.GenericCriteria;
import uz.ergashov.pdp_meal.dto.order.OrderCreateDto;
import uz.ergashov.pdp_meal.dto.order.OrderDto;
import uz.ergashov.pdp_meal.dto.order.OrderUpdateDto;
import uz.ergashov.pdp_meal.entity.order.Order;
import uz.ergashov.pdp_meal.service.GenericCrudService;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
public interface OrderService extends GenericCrudService<
        Order,
        OrderDto,
        OrderCreateDto,
        OrderUpdateDto,
        GenericCriteria,
        Long> {
}
