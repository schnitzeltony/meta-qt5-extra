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

SRC_URI[md5sum] = "1d5d35ceaf5acc036b2280b2b280fcff"
SRC_URI[sha256sum] = "3940e3d28bc0d3409ba2d1259a80d2c13df53e5a9cbb4d8694fa689244310042"

PV = "${KF5_VERSION}"
