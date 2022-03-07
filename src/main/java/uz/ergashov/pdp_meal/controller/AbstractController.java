package uz.ergashov.pdp_meal.controller;

import uz.ergashov.pdp_meal.service.BaseService;

public abstract class AbstractController<S extends BaseService> {
    protected final S service;

    protected AbstractController(S service) {
        this.service = service;
    }
}
