package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class BufferDisplay implements Dispaly {

    List<String> buffer = new ArrayList<>();
    private int bufferSize = 10;
    private ScreenDisplay screenDisplay;

    public BufferDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }
    
    @Override
    public void printf(String content) {
        buffer.add(content);
        if(buffer.size() == bufferSize){
            flush();
        }
        
    }

    private void flush(){
        if(screenDisplay == null) screenDisplay = new ScreenDisplay();
        String lines = String.join("/n",buffer);
        screenDisplay.printf(lines);
        buffer.clear();
    }

}