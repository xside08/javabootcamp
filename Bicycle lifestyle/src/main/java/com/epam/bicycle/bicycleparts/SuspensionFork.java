package com.epam.bicycle.bicycleparts;

import java.util.Objects;

public class SuspensionFork {
    private int forkSize;
    private int forkSuspensionLength;
    private String brandName;

    public SuspensionFork(int forkSize, int forkSuspensionLength, String brandName) {
        this.forkSize = forkSize;
        this.forkSuspensionLength = forkSuspensionLength;
        this.brandName = brandName;
    }

    public int getForkSize() {
        return forkSize;
    }

    public void setForkSize(int forkSize) {
        this.forkSize = forkSize;
    }

    public int getForkSuspensionLength() {
        return forkSuspensionLength;
    }

    public void setForkSuspensionLength(int forkSuspensionLength) {
        this.forkSuspensionLength = forkSuspensionLength;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuspensionFork that = (SuspensionFork) o;
        return forkSize == that.forkSize &&
                forkSuspensionLength == that.forkSuspensionLength &&
                Objects.equals(brandName, that.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forkSize, forkSuspensionLength, brandName);
    }

    @Override
    public String toString() {
        return "SuspensionFork{" +
                "forkSize=" + forkSize +
                ", forkSuspensionLength=" + forkSuspensionLength +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
