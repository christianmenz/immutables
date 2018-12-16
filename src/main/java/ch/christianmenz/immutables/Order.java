package ch.christianmenz.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Order {

    public abstract String identifier();
    public abstract String name();
    public abstract Instrument instrument();
}
