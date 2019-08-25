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

SRC_URI[md5sum] = "af2125c297606f167ce8b9a182e30526"
SRC_URI[sha256sum] = "9ebab1755e9d7cb01b2aa6e8b63640eb112d8557073423abdb94faecb42d87ab"

PV = "${KF5_VERSION}"
