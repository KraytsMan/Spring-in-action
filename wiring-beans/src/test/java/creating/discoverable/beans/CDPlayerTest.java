package creating.discoverable.beans;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CDPlayerConfig.class)
@ContextConfiguration("classpath:META-INF/creating.discoverable.beans.ApplicationContext.xml")
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log =
        new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull()
    {
        assertNotNull(compactDisc);
        assertNotNull(mediaPlayer);
    }

    @Test
    public void play() {
        mediaPlayer.play();
        assertEquals(
            "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
            log.getLog());
    }
}
