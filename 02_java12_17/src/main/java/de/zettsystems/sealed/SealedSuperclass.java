package de.zettsystems.sealed;


public abstract sealed class SealedSuperclass implements SealedInterface permits NonSealedSubclass, SealedSubclass {

}
