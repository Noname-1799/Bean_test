package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class ClassicMusicTest extends TestCase {

    @Test
    public void one(){
        ClassicMusic classicMusic = new ClassicMusic();
        assertEquals((Integer) 1,classicMusic.getId());
    }

}