package de.waischbrot.invlib.events;

import de.waischbrot.invlib.basic.RubyInventory;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.jetbrains.annotations.NotNull;

public class RubyOpenEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final InventoryOpenEvent event;
    private final RubyInventory rubyInventory;
    private boolean isCancelled;

    public RubyOpenEvent(InventoryOpenEvent event, RubyInventory rubyInventory) {
        this.event = event;
        this.rubyInventory = rubyInventory;
    }

    public InventoryOpenEvent getEvent() {
        return event;
    }

    public RubyInventory getRubyInventory() {
        return rubyInventory;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

}