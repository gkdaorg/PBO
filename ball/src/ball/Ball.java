
package ball;

public class Ball {

    public static void onCollisionWithBall(Ball ball){
        if(ball.isBlade == true ){
           getDestroyed();
        }
        else{
            deflectBall();
            
           
        }
        
    }
    
}
