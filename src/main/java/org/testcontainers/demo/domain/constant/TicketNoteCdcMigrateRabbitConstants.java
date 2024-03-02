package org.testcontainers.demo.domain.constant;

public final class TicketNoteCdcMigrateRabbitConstants {

    private TicketNoteCdcMigrateRabbitConstants() {
        throw new IllegalStateException("Constant Class");
    }

    public static final String QUEUE = "ticket-note-cdc-migrate.queue";
    public static final String QUEUE_DLQ = "ticket-note-cdc-migrate.queue.dlq";
    public static final String QUEUE_PARKING_LOT = "ticket-note-cdc-migrate.parking-lot.queue";
    public static final String ROUTING = "TicketNoteCdcMigrateRoutingKey";
    public static final String ROUTING_PARKING_LOT = "TicketNoteCdcMigrateParkingLotRoutingKey";
    public static final String EXCHANGE = "TicketNoteCdcMigrateExchange";
}
