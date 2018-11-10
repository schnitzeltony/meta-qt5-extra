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

SRC_URI[md5sum] = "4968c986f485ddd1882a114647e5c7ac"
SRC_URI[sha256sum] = "8d9a88137995abf42cc11ad8d42c23759939bc837b74f8527d09866c0879c4b1"

PV = "${KF5_VERSION}"
