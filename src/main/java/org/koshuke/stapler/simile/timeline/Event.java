package org.koshuke.stapler.simile.timeline;

import java.util.Date;

/**
 * Event data to be rendered on timeline.
 * See http://code.google.com/p/simile-widgets/wiki/Timeline_EventSources

 * <p>
 * This is bound to JSON and sent to the client-side JavaScript.
 */
public class Event {
    public Date start;
    public Date end;
    public String title, description;
    /**
     * If true, the event occurs over a time duration. No icon. The event will be
     * drawn as a dark blue tape. The tape color is set with the color attribute.
     * Default color is #58A0DC
     *
     * If false (default), the event is focused on a specific "instant" (shown with the icon).
     * The event will be drawn as a blue dot icon (default) with a pale blue tape.
     * The tape is the default color (or color attribute color), with opacity
     * set to 20. To change the opacity, change the theme's instant: {impreciseOpacity: 20}
     * value. Maximum 100.
     */
    public Boolean durationEvent;

    /**
     * Url. The bubble's title text be a hyper-link to this address.
     */
    public String link;

    /**
     * Color of the text and tape (duration events) to display in the timeline.
     * If the event has durationEvent = false, then the bar's opacity will
     * be applied (default 20%). See durationEvent, above.
     */
    public String color;

    /**
     * CSS class name.
     */
    public String classname;
}
