package com.sparta.owframework.frameworktests;

import com.sparta.owframework.OWWeatherDTO.Coord;
import com.sparta.owframework.OWWeatherDTO.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class FrameworkTests {

    Coord coord = new Coord();
    Main main = new Main();
    @DisplayName("Coord")
    @Nested
    class CoordTests{
        @Test
        @DisplayName("Check Lon values are present")
        void LonValuePresent(){

            Assertions.assertNotNull(coord.getLon());

        }
        @Test
        @DisplayName("Check Lat values are present")
        void LatValuePresent(){

            Assertions.assertNotNull(coord.getLat());

        }

        @Test
        @DisplayName("Check Lat datatype")
        void LatDataType(){

            Assertions.assertSame(Double.class,coord.getLat().getClass());
        }

        @Test
        @DisplayName("Check Lon datatype")
        void LonDataType(){

            Assertions.assertSame(Double.class,coord.getLon().getClass());

        }
    }

    @DisplayName("Main")
    @Nested
    class MainTests {
        @Test
        @DisplayName("Check temp values are present")
        void TempPresent() {

            Assertions.assertNotNull(main.getTemp());
        }

        @Test
        @DisplayName("Check Temp Min values are present")
        void TempMinPresent(){

            Assertions.assertNotNull(main.getTempMin());
        }

        @Test
        @DisplayName("Check feel like values are present")
        void FeelsLikeValuePresent(){

            Assertions.assertNotNull(main.getFeelsLike());
        }
        @Test
        @DisplayName("Check temp datatype")
        void TempType(){

            Assertions.assertSame(Double.class,main.getTemp().getClass());

        }
        @Test
        @DisplayName("Check min temp datatype")
        void MinTempType(){

            Assertions.assertSame(Double.class,main.getTempMin().getClass());

        }

        @Test
        @DisplayName("Check feels like datatype")
        void FeelsLikeType(){

            Assertions.assertSame(Double.class,main.getFeelsLike().getClass());

        }



    }

}
