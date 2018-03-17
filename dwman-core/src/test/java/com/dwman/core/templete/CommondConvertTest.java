package com.dwman.core.templete;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommondConvertTest {

    @Test
    public void capU() {
        String capu = "afadfljl[capX]upper[/capX]12313afadfljl[capX]aaafafPPper[/capX]";
        System.out.println(CommondConvert.commondConvertCollection(capu));
    }

    @Test
    public void capu() {
        String capu = "afadfljl[capx]PPper[/capx]fljl[capx]AAAaaaaaPPper[/capx]";
        System.out.println(CommondConvert.commondConvertCollection(capu));

    }

    @Test
    public void upperToLowerAndLine() {
        String reg = "[Utoxline]";
        String capu = "afadfljl[Utoxline]PPper[/Utoxline]fljl[Utoxline]AAAaaaaaPPper[/Utoxline]";
        System.out.println(CommondConvert.commondConvertCollection(capu));

    }

    @Test
    public void lowerToUpperAndLine() {
        String reg = "[Utoxline]";
        String capu = "afadfljl[utoXline]PPper[/utoXline]fljl[utoXline]AAAaaaaaPPper[/utoXline]";
        System.out.println(CommondConvert.commondConvertCollection(capu));
    }
}