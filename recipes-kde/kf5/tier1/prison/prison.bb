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

SRC_URI[sha256sum] = "a2b135ffdf1af240366f3fb077c02c02094fb1706c6e84fab5186802544a5b87"

PV = "${KF5_VERSION}"
