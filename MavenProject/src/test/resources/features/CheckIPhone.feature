Feature: Логин

  # This is comment
  # Gherkin --> Given,Then,And,When,

  Scenario: Пользователь должен войти в систему с корректными данными
    Given Я как пользователь должен открыть сайт Facebook.com
    And Пользователь должен ввести в поле свой email адрес
    And  Пользователь должен ввести в поле пароль  свой Пароль
    When Пользователь нажмет на кнопку Логин
    Then Пользователь должен благополучно войти в систему


