package de.zettsystems.records;

import lombok.Value;

/**
 * Identisch zu CustomerOldSchool, im Vergleich zum record Customer gibt es wieder den getter-Unterschied
 */
@Value
public class CustomerLombok {
    String name;
    boolean vip;
}
