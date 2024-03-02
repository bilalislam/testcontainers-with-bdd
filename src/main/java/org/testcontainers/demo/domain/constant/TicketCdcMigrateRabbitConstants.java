package org.testcontainers.demo.domain.constant;

public final class TicketCdcMigrateRabbitConstants {

    private TicketCdcMigrateRabbitConstants() {
        throw new IllegalStateException("Constant Class");
    }

    public static final String QUEUE = "ticket-cdc-migrate.queue";
    public static final String QUEUE_DLQ = "ticket-cdc-migrate.queue.dlq";
    public static final String QUEUE_PARKING_LOT = "ticket-cdc-migrate.parking-lot.queue";
    public static final String ROUTING = "TicketCdcMigrateRoutingKey";
    public static final String ROUTING_PARKING_LOT = "TicketCdcMigrateParkingLotRoutingKey";
    public static final String EXCHANGE = "TicketCdcMigrateExchange";
}
