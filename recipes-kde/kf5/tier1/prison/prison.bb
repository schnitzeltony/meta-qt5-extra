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

SRC_URI[md5sum] = "9e76c7991e42b1f2edbd6e942c5519f0"
SRC_URI[sha256sum] = "ef6a3f29e3f030e254343600f051317f6f8a99185d8ad93d78d849bf31bb0894"

PV = "${KF5_VERSION}"
