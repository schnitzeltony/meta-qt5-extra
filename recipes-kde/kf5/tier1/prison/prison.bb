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

SRC_URI[md5sum] = "7c372e723a3cb713cbad3c0880157a0b"
SRC_URI[sha256sum] = "31e136dd33940f32fdb87699b113c57aab566112bb9649f20a057c4eee20db2e"

PV = "${KF5_VERSION}"
