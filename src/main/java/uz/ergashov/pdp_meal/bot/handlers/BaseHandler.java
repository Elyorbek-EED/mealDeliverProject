package uz.ergashov.pdp_meal.bot.handlers;

import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
public interface BaseHandler {
    void process(Update update);
}
