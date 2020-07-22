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

SRC_URI[md5sum] = "86a19b310f732ff592fa782cbf0f7233"
SRC_URI[sha256sum] = "57263b30ebddf564200355bf202763d9314f52aa0c50621ed79a29c8ead4dccc"

PV = "${KF5_VERSION}"
