/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class Time2 {
    private int seconds;
    
    public Time2(){
        this(0,0,0);
    }
    public Time2(int hour){
        this(hour, 0 , 0);
    }
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    
    }
    
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if(minute < 0 || minute >= 60 ){
            throw new IllegalArgumentException("minute must be 0-60");
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-60");
        }
        
        this.seconds = (hour * 3600 + minute * 60 + second);
    }
    public Time2 (Time2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    
    public int getHour(){
        return  (int)(this.seconds / 3600);
    }
    public int getMinute(){
        return  ((this.seconds -(this.getHour() * 3600) )/60) ;
    }
    public int getSecond(){
        return  (this.seconds - (this.getHour() * 3600) - (this.getMinute() * 60));    
    }

    public void setTime(int hour, int minute, int second){
        
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if(minute < 0 || minute >= 60 ){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        
        this.seconds = (hour * 3600) + (hour * 60) + second;
            
            
    }
    public void setHour(int hour){
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        
        this.seconds = (this.seconds - (this.getHour() * 3600)) + (hour * 3600);
    }

    public void setMinute(int minute){
        
        if(minute < 0 || minute >= 60 ){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        
        this.seconds = (this.seconds -(this.getMinute() * 60) ) + minute * 60;
    }

    public void setSecond(int second){
        
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-59");
        }
        
        this.seconds = this.seconds - this.getSecond() + second;
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond() );
    
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", ((this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12),
                this.getMinute(), this.getSecond(),(getHour() < 12 ? "AM" : "PM"));
    
    }

}
