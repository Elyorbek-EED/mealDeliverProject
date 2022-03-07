package uz.ergashov.pdp_meal.mapper.order;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;
import uz.ergashov.pdp_meal.dto.order.OrderCreateDto;
import uz.ergashov.pdp_meal.dto.order.OrderDto;
import uz.ergashov.pdp_meal.dto.order.OrderUpdateDto;
import uz.ergashov.pdp_meal.entity.order.Order;
import uz.ergashov.pdp_meal.mapper.BaseMapper;

import java.util.List;
/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Component
@Mapper(componentModel = "spring")
public interface OrderMapper extends BaseMapper<
        Order,
        OrderDto,
        OrderCreateDto,
        OrderUpdateDto> {

    @Override
    OrderDto toDto(Order order);

    @Override
    List<OrderDto> toDto(List<Order> e);

    @Override
    Order fromCreateDto(OrderCreateDto orderCreateDto);

    @Override
    Order fromUpdateDto(OrderUpdateDto orderUpdateDto);

    Order fromUpdateDto(OrderUpdateDto dto, @MappingTarget Order order);
}
