package com.alljokes;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Real;
//import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.All;
//import static javax.swing.text.html.HTML.Tag.I;
//import static sun.java2d.cmm.ColorTransform.Out;

public class ChadJokeClass {
    public String punchLine(){
        String[] bumperSticker = {
                "Horn broken. Watch for finger",
                "Your kid may be an honors student, but you're still an idiot.",
                "All generalizations are false.",
                "Cover me.  I'm changing lanes.",
                "I brake for no apparent reason.",
                "Learn from your parents ' mistakes - use birth control.",
                "I 'm not as think as you drunk I am.",
                "Forget about World Peace...Visualize using your turn signal.",
                "We have enough youth, how about a fountain of Smart?",
                "He who laughs last thinks slowest.",
                "It IS as bad as you think, and they ARE out to get you.",
                "Auntie Em, Hate you, hate Kansas, taking the dog.Dorothy.",
                "Change is inevitable, except from a vending machine.",
                "Time is what keeps everything from happening at once.",
                "I love cats...they taste just like chicken.",
                "Out of my mind.Back in five minutes.",
                "Forget the Joneses, I keep us up with the Simpsons.",
                "Born free...Taxed to death.",
                "The more people I meet, the more I like my dog.",
                "Laugh alone and the world thinks you 're an idiot.",
                "I get enough exercise just pushing my luck.",
                "Sometimes I wake up grumpy;",
                "All men are idiots, and I married their King."};
        int randomJoke = new Random().nextInt(bumperSticker.length);

        return bumperSticker[randomJoke];
    }
}
