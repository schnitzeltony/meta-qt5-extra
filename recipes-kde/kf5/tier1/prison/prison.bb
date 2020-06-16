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

SRC_URI[md5sum] = "c06a7b68ee02dcfb36378d7daf184cc3"
SRC_URI[sha256sum] = "44762ee7a3993bd7527f0b33ee09bacc1d5a518641b79932e5490a511ac7e87f"

PV = "${KF5_VERSION}"
