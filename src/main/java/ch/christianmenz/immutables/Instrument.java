package ch.christianmenz.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Instrument {

    public abstract String identifier();
    public abstract String name();
}
