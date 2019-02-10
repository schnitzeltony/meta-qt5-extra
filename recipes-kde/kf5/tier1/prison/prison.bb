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

SRC_URI[md5sum] = "c09b474c3f96c20504834b5df84c54f1"
SRC_URI[sha256sum] = "07c4074a6f37ccd3acecad283286adb86ecec429b7bccfd0a15533839d604df5"

PV = "${KF5_VERSION}"
