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

SRC_URI[md5sum] = "cc3150002229c212a1a2cc03bd31af4d"
SRC_URI[sha256sum] = "d7a024881119e2e91fe2ef98ec982f33e87d3f5584c3e4438638e23cf0106fb0"

PV = "${KF5_VERSION}"
