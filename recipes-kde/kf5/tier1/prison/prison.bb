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

SRC_URI[md5sum] = "e049ed74bc0a048aae9eee0639f06cb1"
SRC_URI[sha256sum] = "1b8149b8965c287f7fddfd91fb1d9cf95f150dda5b70b19480452c2e855945b5"

PV = "${KF5_VERSION}"
