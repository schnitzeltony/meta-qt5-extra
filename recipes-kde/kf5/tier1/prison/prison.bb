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

SRC_URI[md5sum] = "39aa46a90d5d7a51edc0e7bfaa5e03cf"
SRC_URI[sha256sum] = "6b8e6db9ce142d47014403c6e5bcc79c8a7a77b3a490102d508a4f4866f5effc"

PV = "${KF5_VERSION}"
