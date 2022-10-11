package org.xnio;

/**
 * A relaying listener for channel events.
 * It relays to the wrapped listener after handling the event itself. 
 */
public interface RelayingPriorityStreamConnectionChannelListener extends ChannelListener<StreamConnection> {

   /**
    * Set the wrapped listener.
    * 
    * @param wrappedStreamConnectionChannelListener  the listener to set
    */
   public void setWrappedChannelListener( ChannelListener<StreamConnection> wrappedStreamConnectionChannelListener );

   /**
    * Get the wrapped listener.
    * 
    * @return  the wrapped listener
    */
   public ChannelListener<StreamConnection> getWrappedChannelListener( );
}
