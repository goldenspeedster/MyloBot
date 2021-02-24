package commands.music;

import lib.commands.music.Music;
import lib.commands.music.TrackScheduler;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @author Patrick Ubelhor
 * @version 2/24/2021
 */
public class Unpause extends Music {
	
	public Unpause() {
		super("unpause");
	}
	
	
	@Override
	public void run(MessageReceivedEvent event, String[] args) {
		TrackScheduler trackScheduler = Music.trackSchedulers.get(event.getGuild().getIdLong());
		trackScheduler.unpause();
	}
	
	@Override
	public String getUsage() {
		return getName();
	}
	
	@Override
	public String getDescription() {
		return "Continues playing a paused track";
	}
	
}
