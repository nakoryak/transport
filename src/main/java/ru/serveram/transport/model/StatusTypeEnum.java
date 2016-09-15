package ru.serveram.transport.model;

/**
 * Created by pavel on 10.09.16.
 * Зачем хранить тип статуса в БД, если есть enum
 */
public enum StatusTypeEnum {
    create (1, "Создан"),
    appointed (2, "Назначен"),
    executed (3, "Исполнен"),
    canceled (4, "Отменен"),
    overdue (5, "Просрочен");
    private final Integer id;
    private final String name;

    StatusTypeEnum(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Integer getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
}
