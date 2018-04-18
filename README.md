# droidcontrol
A java library to run action on your android device using adb :) 

**Requirements:**
- Java (Java Runtime Environment) (Tested on 8u171) (Recommended : 7+)
- ADB ( Android Debug Bridge)
- VLC (for streaming phone screen content)
- ffplay (**Alternative**)(for streaming phone screen content)

# Usage
## Inputs
  **Swipe**
  
  ```java droidcontrol swup1```
  
  Swipe up the screen from one fourth.
  
  
  ```java droidcontrol swup2```
  
  Swipe up the screen half.
  
  
  ```java droidcontrol swup3```
  
  Swipe up the screen from bottom to top.
---

  ```java droidcontrol swdn1```
  
  Swipe down the screen from one fourth.
  
  
  ```java droidcontrol swdn2```
  
  Swipe down the screen half.
  
  
  ```java droidcontrol swdn3```
  
  Swipe down the screen from bottom to top.
---

  ```java droidcontrol swlft1```
  
  Swipe left complete screen in 250ms
  
  
  ```java droidcontrol swlft2```
  
  Swipe left complete screen in 150ms
  
  
  ```java droidcontrol swlft3```
  
  Swipe left complete screen in 50ms
  
  ## TODO
  - Make functions for better code exec.
  - Remove redundant, unecessary ```waitfor()``` to improve runtime performance
  - Complete documentation.
