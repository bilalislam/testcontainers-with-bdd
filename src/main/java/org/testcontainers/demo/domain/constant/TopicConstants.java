package org.testcontainers.demo.domain.constant;

public final class TopicConstants {

    private TopicConstants() {
        throw new IllegalStateException("Constant Class");
    }

    public static final String DEFINED_TROUBLE_TICKET_PRIORITY = "helpdesk.definedTroubleTicketPriority";
    public static final String UPDATED_TROUBLE_TICKET = "helpdesk.updatedTroubleTicket";
    public static final String UPDATED_ASSIGN_USER = "helpdesk.updatedAssignUser";
    public static final String SOCKET_UPDATED_ASSIGN_USER = "helpdesk.socket.updatedAssignUser";
    public static final String CORE_CREATED_UNASSIGNED_TICKET = "core.createdUnassignedTicket";
    public static final String COMPLETE_TICKET = "helpdesk.completeTicket";
    public static final String TRANSFER_TICKET = "helpdesk.transferTicket";
    public static final String NOTE_TICKET = "helpdesk.noteTicket";
    public static final String REPLY_EVENT = "helpdesk.replyEvent";
    public static final String UPDATE_CLOSE_SCHEDULE_TICKET = "helpdesk.updateCloseScheduleTicket";
    public static final String UPDATE_POSTPONE_SCHEDULE_TICKET = "helpdesk.updatePostponeScheduleTicket";


    public static final String CORE_CREATED_UNASSIGNED_TICKET_GROUP_ID = "core.unassigned-ticket-group-id";

    public static final String SET_TICKET_NOTE_EXTERNAL_ID = "helpdesk.setTicketNoteExternalId";
    public static final String MIGRATE_TICKET_LEGACY_TRANSACTION = "helpdesk.migrateTicketLegacyTransaction";

    public static final String SET_TICKET_EXTERNAL_ID = "helpdesk.setTicketExternalId";

    public static final String UNASSIGNED_TICKET = "helpdesk.unassignedTicket";
    public static final String WRITE_LEGACY_TICKET = "helpdesk.writeLegacyTicket";

}
