Feature: Validar el campo id del servicio posts

  Scenario: Validar que el id sea igual a 2
    Given consumo el servicio posts con id 2
    When ejecuto la peticion GET
    Then el campo id debe ser igual a 2
