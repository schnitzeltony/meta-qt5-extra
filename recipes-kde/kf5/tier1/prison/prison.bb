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

SRC_URI[md5sum] = "09d1021ec61e1f4a53fcbec700e5e528"
SRC_URI[sha256sum] = "ff5b4ae32ae44f2aea4b9254afe54af0fc9ea742517116cd2322e1a71a7315ce"

PV = "${KF5_VERSION}"
