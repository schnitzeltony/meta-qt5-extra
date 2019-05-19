SUMMARY = "Barcode abstraction layer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02744127548d68b579a51bda5af08e2b \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[md5sum] = "7c2a5f7808304f3d8404a8083bf54e8f"
SRC_URI[sha256sum] = "2bd97bf19e70b67cac49eaefb89a0fe8bd506e710e10df41f9b7c65d9dc30b1d"

PV = "${KF5_VERSION}"
