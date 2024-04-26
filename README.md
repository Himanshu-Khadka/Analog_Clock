# Analog Clock

The `Clock` class is designed to display an analog clock using JavaFX. This clock consists of a circle representing the clock face, with three hands indicating the hour, minute, and second.

## Hand Positioning:

Each hand of the clock is represented by a line segment, characterized by its starting point (StartX, StartY) and ending point (endX, endY). These coordinates are determined based on the length of the hand and its angle relative to the center of the clock face.

The formula used to calculate the endpoint coordinates of a hand is:

```java
endX = centerX + lengthOfArm * sin(angle)
endY = centerY - lengthOfArm * cos(angle)
```

Where:
- `centerX` and `centerY` are the coordinates of the center of the clock face.
- `lengthOfArm` is the length of the hand.
- `angle` is the angle at which the hand is positioned.


### Mathematics Behind Hand Positioning:

In terms of trigonometry, the equations for determining the endpoint coordinates (endX, endY) of a line segment (hand) on a 2D plane embody elegance and precision. Let's look into their beauty:

- **Sine Function (sin):** 
  - Imagine a right triangle, where the sine of an angle is the ratio of the side opposite to the angle and the hypotenuse. Symbolically, sin(𝜃) = opposite/hypotenuse.
  - In our context, `endX = centerX + lengthOfArm * sin(angle)` crafts the graceful arc of the hand along the vertical axis. The sin(angle) elegantly calculates this ascent, gracefully scaling it by the hand's length.

- **Cosine Function (cos):** 
  - Picture another right triangle, where the cosine of an angle represents the ratio of the adjacent side to the hypotenuse. Symbolically, cos(𝜃) = adjacent/hypotenuse.
  - Meanwhile, `endY = centerY - lengthOfArm * cos(angle)` orchestrates the lateral glide of the hand, mirroring its journey along the horizontal axis. The cos(angle) ensures this graceful slide, subtracting it from centerY to align with our Cartesian coordinates.

These equations, like strokes of a masterful brush on a canvas, reveal the mesmerizing dance of mathematics in crafting the precise positioning of each hand on our analog clock.

## Angle Calculation:

- **Second Hand:** The angle for the second hand is determined by the current second, using the formula:
  ```java
  angle = second * (2π / 60)
  ```

- **Minute Hand:** The angle for the minute hand is calculated based on the current minute and second, using:
  ```java
  angle = (minute + second / 60) * (2π / 60)
  ```

- **Hour Hand:** Similarly, the angle for the hour hand considers the current hour, minute, and second:
  ```java
  angle = (hour + minute / 60 + second / (60 * 60)) * (2π / 12)
  ```

For simplicity, the calculation can omit seconds due to their minimal impact on the position of the minute and hour hands.

## Obtaining Current Time:

The current time is retrieved using the `GregorianCalendar` class in Java, providing the necessary hour, minute, and second components for calculating the hand positions.

This approach allows for the accurate representation of time on the analog clock, ensuring each hand reflects the correct time with respect to its angle and length.


Feel free to contribute and improve this analog clock implementation!
