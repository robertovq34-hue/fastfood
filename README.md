classDiagram
    %% Estrategia
    class PaymentStrategy {
        <<interface>>
        +pay(double amount) double
        +getName() String
    }

    class CardStrategy {
        +pay(double amount) double
        +getName() String
    }

    class YapeStrategy {
        +pay(double amount) double
        +getName() String
    }

    class CashStrategy {
        +pay(double amount) double
        +getName() String
    }

    PaymentStrategy <|.. CardStrategy
    PaymentStrategy <|.. YapeStrategy
    PaymentStrategy <|.. CashStrategy

    %% Observer
    class Observer {
        <<interface>>
        +update(Payment payment)
        +getName() String
    }

    class UserAppObserver {
        +update(Payment payment)
        +getName() String
    }

    class AccountingObserver {
        +update(Payment payment)
        +getName() String
    }

    Observer <|.. UserAppObserver
    Observer <|.. AccountingObserver

    %% Payment
    class Payment {
        -double baseAmount
        -double totalAmount
        -String methodName
        +getBaseAmount()
        +getTotalAmount()
        +getMethodName()
    }

    %% PaymentProcessor (Subject)
    class PaymentProcessor {
        -List~Observer~ observers
        -PaymentStrategy strategy
        +addObserver(Observer)
        +removeObserver(Observer)
        +notifyObservers(Payment)
        +setStrategy(PaymentStrategy)
        +processPayment(double)
    }

    PaymentProcessor --> PaymentStrategy
    PaymentProcessor --> Observer
    PaymentProcessor --> Payment
