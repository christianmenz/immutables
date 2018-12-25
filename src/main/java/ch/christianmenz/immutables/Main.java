package ch.christianmenz.immutables;

public class Main {

    public static void main(String[] args) {
        ImmutableOrder.Builder builder = ImmutableOrder.builder();
        ImmutableInstrument instrument = ImmutableInstrument.builder().identifier("instr1").name("Tesla").build();
        ImmutableOrder order = builder.name("Test").instrument(instrument).identifier("ord1").build();

        // Build a new order based on existing order
        ImmutableOrder order1 = ImmutableOrder.builder().from(order).name("Test2").build();
    }
}
