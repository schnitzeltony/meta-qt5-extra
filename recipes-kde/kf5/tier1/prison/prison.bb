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

SRC_URI[md5sum] = "6d43dbc20090f8edcc917ca77d21e5e1"
SRC_URI[sha256sum] = "79d091e84f2539130224160c2ce51446e2b5f04352938c2a45fdb9973282817e"

PV = "${KF5_VERSION}"
