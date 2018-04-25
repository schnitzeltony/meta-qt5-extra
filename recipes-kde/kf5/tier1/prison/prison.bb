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

SRC_URI[md5sum] = "dc84cdb5abedd1c3f63a4481c2220d90"
SRC_URI[sha256sum] = "20f645e263df3f32be04485bd21fcdb02d46c1f5c91f411c43e26b82bab7d9bc"

PV = "${KF5_VERSION}"
