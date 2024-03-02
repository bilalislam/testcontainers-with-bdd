package org.testcontainers.demo.domain.constant;

public final class TicketNoteBatchMigrateRabbitConstants {

    private TicketNoteBatchMigrateRabbitConstants() {
        throw new IllegalStateException("Constant Class");
    }

    public static final String QUEUE = "ticket-note-batch-migrate.queue";
    public static final String QUEUE_DLQ = "ticket-note-batch-migrate.queue.dlq";
    public static final String QUEUE_PARKING_LOT = "ticket-note-batch-migrate.parking-lot.queue";
    public static final String ROUTING = "TicketNoteBatchMigrateRoutingKey";
    public static final String ROUTING_PARKING_LOT = "TicketNoteBatchMigrateParkingLotRoutingKey";
    public static final String EXCHANGE = "TicketNoteBatchMigrateExchange";
}
