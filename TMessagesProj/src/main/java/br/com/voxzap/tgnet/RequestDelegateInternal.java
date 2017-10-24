package br.com.voxzap.tgnet;

public interface RequestDelegateInternal {
    void run(int response, int errorCode, String errorText, int networkType);
}
