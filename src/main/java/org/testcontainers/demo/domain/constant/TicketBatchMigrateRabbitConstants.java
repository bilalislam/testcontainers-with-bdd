package org.testcontainers.demo.domain.constant;

public final class TicketBatchMigrateRabbitConstants {

    private TicketBatchMigrateRabbitConstants() {
        throw new IllegalStateException("Constant Class");
    }

    public static final String QUEUE = "ticket-batch-migrate.queue";
    public static final String QUEUE_DLQ = "ticket-batch-migrate.queue.dlq";
    public static final String QUEUE_PARKING_LOT = "ticket-batch-migrate.parking-lot.queue";
    public static final String ROUTING = "TicketBatchMigrateRoutingKey";
    public static final String ROUTING_PARKING_LOT = "TicketBatchMigrateParkingLotRoutingKey";
    public static final String EXCHANGE = "TicketBatchMigrateExchange";
}
