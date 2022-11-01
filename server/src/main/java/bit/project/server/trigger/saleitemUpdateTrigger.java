package bit.project.server.trigger;

import bit.project.server.util.trigger.Trigger;

public class saleitemUpdateTrigger extends Trigger {


    @Override
    public String getName() {
        return "saleitem_update";
    }

    @Override
    public Event getEvent() {
        return Event.AFTER_UPDATE;
    }

    @Override
    public String getTableName() {
        return "saleitem";
    }

    public saleitemUpdateTrigger() {
        addBodyLine("update item set qty=qty+(NEW.qty + OLD.qty) where id=OLD.item_id;");
    }
}
